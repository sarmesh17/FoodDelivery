import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
//import androidx.compose.material3.icons.Icons
//import androidx.compose.material3.icons.filled.Clear
//import androidx.compose.material3.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextFieldWithIcons() {
    val textState = remember { mutableStateOf("") }

    OutlinedTextField(
        value = textState.value,
        onValueChange = { textState.value = it },
        modifier = Modifier.fillMaxWidth(),
        label = { Text("Search") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Search Icon"
            )
        },
        trailingIcon = {
            if (textState.value.isNotEmpty()) {
                IconButton(onClick = { textState.value = "" }) {
                    Icon(
                        imageVector = Icons.Filled.Clear,
                        contentDescription = "Clear Icon"
                    )
                }
            }
        },
        //colors = TextFieldDefaults.outlinedTextFieldColors()
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldWithIconsPreview() {
    TextFieldWithIcons()
}
