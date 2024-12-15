package com.example.fooddelivery.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch

class SignupViewModel : ViewModel() {

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }
    private val db = Firebase.firestore
    fun signup(email: String, password: String, name: String) {

        viewModelScope.launch {
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val user = auth.currentUser
                        user?.let { firebaseUser ->
                            val userId = firebaseUser.uid
                            val userInfo = hashMapOf(
                                "userId" to userId,
                                "name" to name,
                                "email" to email,
                                "password" to password
                            )

                            // Save user information to Firestore under "users" collection
                            db.collection("users").document(userId)
                                .set(userInfo)
                                .addOnSuccessListener {
                                    // Handle successful signup and Firestore save
                                    Log.d(
                                        "SignupViewModel",
                                        "User data added to Firestore successfully"
                                    )
                                }
                                .addOnFailureListener { e ->
                                    // Handle unsuccessful Firestore save
                                    Log.w(
                                        "SignupViewModel",
                                        "Error adding user data to Firestore",
                                        e
                                    )
                                }
                        }
                    } else {
                        // Signup failed, log the exception
                        Log.w(
                            "SignupViewModel",
                            "createUserWithEmailAndPassword:failure",
                            task.exception
                        )
                    }
                }
        }
    }
}