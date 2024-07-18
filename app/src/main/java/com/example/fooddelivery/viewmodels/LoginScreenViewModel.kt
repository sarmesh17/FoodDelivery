package com.example.fooddelivery.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.launch

class LoginScreenViewModel:ViewModel() {

    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun validateUser(email: String, password: String) {

        viewModelScope.launch {

            // Accesses the "users" collection in Firestore and queries for a document with the matching email
            firestore.collection("users")
                .whereEqualTo("email", email)
                .get() // Executes the query
                .addOnSuccessListener { documents -> // Handles the success scenario of the query

                    // Checks if no documents were returned by the query
                    if (documents.isEmpty) {

                        // Logs that no user was found with the provided email
                        Log.d("LoginViewModel", "User not found")

                    } else {

                        // Retrieves the first document from the result
                        val document = documents.documents[0]
                        // Extracts the password field from the document
                        val storedPassword = document.getString("password")

                        // Checks if the stored password matches the provided password
                        if (storedPassword == password) {
                            // Logs that the login was successful
                            Log.d("LoginViewModel", "Login Successful")

                        } else {

                            // Logs that the provided password is invalid

                            Log.d("LoginViewModel", "Invalid password")

                        }
                    }

                }
                .addOnFailureListener { exception ->   // Handles the failure scenario of the query
                    // Logs the exception message if the query failed

                    Log.d("LoginViewModel", exception.toString())

                }
        }
    }
}