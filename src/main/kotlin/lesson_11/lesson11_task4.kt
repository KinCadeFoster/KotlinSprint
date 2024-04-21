package lesson_11

class RecipeCategory(
    val category: Int,
    val picture: String,
    val title: String,
    val description: String,
)

class Recipe(
    val category: Int,
    val picture: String,
    val title: String,
)

class Ingredient(
    val uid: String,
    val ingredient: List<MutableMap<String, String>>,
    val cookingMethod: List<String>,
)