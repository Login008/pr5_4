fun main()
{
    try
    {
        print("Введите двузначное число: ")
        var number = readLine()!!.toInt()
        when
        {
            number > 99 -> println("Введённое число было не двузначным")
            (number < 10) and (number > -10) -> println("Введённое число было не двузначным")
            number < -99 -> println("Введённое число было не двузначным")
            else -> when
            {
                (number % 10 == 3) and (number / 10 == 6) -> println("В записи данного числа имеются цифры 3 и 6")
                (number % 10 == 3) and (number / 10 == 9) -> println("В записи данного числа имеются цифры 3 и 9")
                (number / 10 == 3) and (number % 10 == 6) -> println("В записи данного числа имеются цифры 3 и 6")
                (number / 10 == 3) and (number % 10 == 9) -> println("В записи данного числа имеются цифры 3 и 9")

                (number % 10 == 6) and (number / 10 == 3) -> println("В записи данного числа имеются цифры 3 и 6")
                (number % 10 == 6) and (number / 10 == 9) -> println("В записи данного числа имеются цифры 6 и 9")
                (number / 10 == 6) and (number % 10 == 3) -> println("В записи данного числа имеются цифры 3 и 6")
                (number / 10 == 6) and (number % 10 == 9) -> println("В записи данного числа имеются цифры 6 и 9")

                (number % 10 == 3) or (number / 10 == 3) -> println("В записи данного числа имеется цифра 3")
                (number % 10 == 6) or (number / 10 == 6) -> println("В записи данного числа имеется цифра 6")
                (number % 10 == 9) or (number / 10 == 9) -> println("В записи данного числа иммется цифра 9")

                else -> when
                {
                    (number % 10 == -3) and (number / 10 == -6) -> println("В записи данного числа имеются цифры 3 и 6")
                    (number % 10 == -3) and (number / 10 == -9) -> println("В записи данного числа имеются цифры 3 и 9")
                    (number / 10 == -3) and (number % 10 == -6) -> println("В записи данного числа имеются цифры 3 и 6")
                    (number / 10 == -3) and (number % 10 == -9) -> println("В записи данного числа имеются цифры 3 и 9")

                    (number % 10 == -6) and (number / 10 == -3) -> println("В записи данного числа имеются цифры 3 и 6")
                    (number % 10 == -6) and (number / 10 == -9) -> println("В записи данного числа имеются цифры 6 и 9")
                    (number / 10 == -6) and (number % 10 == -3) -> println("В записи данного числа имеются цифры 3 и 6")
                    (number / 10 == -6) and (number % 10 == -9) -> println("В записи данного числа имеются цифры 6 и 9")

                    (number % 10 == -3) or (number / 10 == -3) -> println("В записи данного числа имеется цифра 3")
                    (number % 10 == -6) or (number / 10 == -6) -> println("В записи данного числа имеется цифра 6")
                    (number % 10 == -9) or (number / 10 == -9) -> println("В записи данного числа иммется цифра 9")

                    else -> println("В записи данного числа не имеются цифры 3, 6 или 9")
                }
            }
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}