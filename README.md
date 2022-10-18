# Frontline
###### Coding Assessment

How to execute and see the output:
> Run the main.java file.
> 
> For other test cases please run test classes.
> 
> i)MonotoneSubArrayTest
> 
> ii)MonotoneTest
> 
> iii)TreeTest
> 

###### Test cases covered:
>i)Happy path scenarios
>
>ii)NullPointerException
>
>iii)IllegalArgumentException

###### Monotone sub Array 
1) Input array = {1, 2, 3, 4, 5, 6, 2, 10, 2, 10}
2) output = {1, 2, 3, 4, 5, 6, 10}
3) output length = 7


###### Tree structure 
Input 
>1.2.3
>
>1.2.5
>
>1.5.6
>
>1.2.4
>
>2.5.6
>
>1.5.7
>
>2.5.3

out put
>1
>
>--2
>
>----3
>
>----4
>
>----5
>
>--5
>
>----6
>
>----7
>
>2
>
>--5
>
>----3
>
>----6

###### Tested other tree structure
Input 
>2.3.5.8
>
>1.2.3.4
>
>1.2.5.6

output
>1
>
>--2
>
>----3
>
>------4
>
>----5
>
>------6
>
>2
>
>--3
>
>----5
>
>------8
