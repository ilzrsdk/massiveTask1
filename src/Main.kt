//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите количество строк: ")
    var i = readln()
    while (i.toIntOrNull() == null || i.toInt() <= 0)
    {
        println("Ошибка ввода!")
        print("Введите количество строк: ")
        i = readln()
    }
    print("Введите количество столбцов: ")
    var j = readln()
    while (j.toIntOrNull() == null || j.toInt() <= 0)
    {
        println("Ошибка ввода!")
        print("Введите количество столбцов: ")
        j = readln()
    }
    val str = i.toInt()
    val stl = j.toInt()
    var Massive = IntArray(str*stl)
    for (i in Massive)
    {
        for (j in Massive)
        {
            Massive[i] = readln()
        }
    }

}