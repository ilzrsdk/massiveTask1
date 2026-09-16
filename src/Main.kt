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
    val Massive = Array(i.toInt()) { IntArray(j.toInt()) }
    for (i in 0 .. Massive.size - 1)
    {
        for (j in 0 .. Massive[0].size - 1)
        {
            print("Введите трехзначное число: ")
            var num = readln()
            while ( num.toIntOrNull() == null || num.toInt() < 100 || num.toInt() > 999)
            {
                println("Ошибка ввода!")
                print("Введите трехзначное число: ")
                num = readln()
            }
            Massive[i][j] = num.toInt()
        }
    }
    val digits = mutableSetOf<Char>()
    println("Массив:")
    for (m in 0 .. Massive.size - 1)
    {
        for (n in 0 .. Massive[0].size - 1)
        {
            var el = Massive[m][n].toString()
            print("$el ")
            for (i in el)
            {
                digits.add(i)
            }
        }
        println()
    }
    println("\nВ массиве ${digits.size} различных цифр")
}