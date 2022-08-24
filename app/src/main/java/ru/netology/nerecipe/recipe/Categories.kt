package ru.netology.nerecipe.recipe

internal enum class Categories(
    val key: String,
    val id: Int
) {
    European("european",0),
    Asian("asian",1),
    PanAsian("pan_asian",2),
    Eastern("eastern",3),
    American("american",4),
    Russian("russian",5),
    Mediterranean("mediterranean",6);
}