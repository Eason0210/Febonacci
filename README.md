#斐波那契数列 （fibonacci）的递归算法
 这是在Java 语言下的算法实现
 在Haskell 中的实现更加简洁，只需要一条语句：
    fib = 1 : 1: [a+b | (a,b) <- zip fib (tail fib)]
    fib300 = fib !! 10
    结果：89
