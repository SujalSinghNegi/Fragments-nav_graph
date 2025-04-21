# How to use the nav graph
 ## Step 1.
 Create the navigation resource flle and inside that create the nav_graph.xml

 ## Step 2.
Add this Fragment Container View to your acitivity_main.xml
 ```
<androidx.fragment.app.FragmentContainerView
    android:id="@+id/nav_host_fragment"
    android:name="androidx.navigation.fragment.NavHostFragment"
    app:defaultNavHost="true"
    app:navGraph="@navigation/nav_graph"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
 />

```

## Important 
## 1. 
Inside the nav_graph, there is a attributte called startDestination, this will be the first starting fragment

```
  app:startDestination="@id/blankFragment1"
```
## 2. 
To navigate in between the fragments, yo first define the nav_graph from  connecting the edges by arrows.
Then from switching to frag1 to frag2, inside any button or somthing else define this

            val navController = findNavController()
            navController.navigate(R.id.action_blankFragment23_to_blankFragment)



## Dependencies not mandatory
// Navigation Component
```
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation( "androidx.navigation:navigation-ui-ktx:2.7.7")
```
## or 

```

    val nav_version = "2.8.9"

    // Jetpack Compose integration
    implementation("androidx.navigation:navigation-compose:$nav_version")

    // Views/Fragments integration
    implementation("androidx.navigation:navigation-fragment:$nav_version")
    implementation("androidx.navigation:navigation-ui:$nav_version")

    // Feature module support for Fragments
    implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")

    // Testing Navigation
    androidTestImplementation("androidx.navigation:navigation-testing:$nav_version")

    // JSON serialization library, works with the Kotlin serialization plugin
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")


```
