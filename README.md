<style>
body, html {font-family: "Times New Roman", Times, serif;}
</style>

# **Intro To Computer Science**

Week 1
=========

*** Add exam dates and assignments to your calendar. ***

When submitting your assignments there are two places to submit there:

        - AutoLab: For automatically grading coding assignments
        - Gradescope: For written assignments

The CAVE:

        https://resources.cs.rutgers.edu/docs/rooms-equipment/cave/

Algorithm Development:

1. Analyze:
        Understand the problem you are solving.
2. Solve:
        Develope a step by step algo.
        Use a "language" to express it
3. Evaluate:
        Play a human computer to see how the algo works.
        Mistake? Go back to 1 and/or 2.


ALGO RUNTIME: Understand the running time of an algo.


Example:

Inputs: HoursW, wage
Output: Salary

Errors: negative hours, wages less than 1.


```
READ HoursW                             -- 1 operation
READ wages                              -- 1 operation
if(HoursW < 0) or (wages <= 0):         -- 2 operations
        DISPLAY error                   -- 1 operation
else:                                   -- no operations
        HoursW * wages = salary         -- 1 operation
        Sys.out.print(salary)           -- 1 operations
ENDIF                                   -- 0 operations

mod--- % (12 %2 = 0)
```


Week 2
==========

INCREMENTATION:
----------------

```pseudocode

SET x TO 1			// x is initiated as

WHILE x < 5:		// will work while condition is true 
	DISPLAY x		// Display the number
	INCREMENT x		// Adds one to x
ENDWHILE

```

Taking user input:

```

READ m				// 1 operation

IF m < 1 THEN			// 1 operation
	DISPLAY ERROR		// 1 operation
ELSE
	SET x to 1			//Algorithm Development:

```

1. Analyze:
        Understand the problem you are solving.
2. Solve:
        Develope a step by step algo.
        Use a "language" to express it
3. Evaluate:
        Play a human computer to see how the algo works.
        Mistake? Go back to 1 and/or 2.


ALGO RUNTIME: Understand the running time of an algo.


Example:

Inputs: HoursW, wage
Output: Salary

Errors: negative hours, wages less than 0

```

READ HoursW                             -- 1 operation
READ wages                              -- 1 operation
if(HoursW < 0) or (wages <= 0):         -- 2 operations
        DISPLAY error                   -- 1 operation
else:                                   -- no operations
        HoursW * wages = salary         -- 1 operation
        Sys.out.print(salary)           -- 1 operations
ENDIF                                   -- 0 operations

mod--- % (12 %2 = 0) 1 operation
	
	while x < m:			// 1 operation
		DISPLAY x		// 1 operation
		INCREMENT x		// 1 operation
	ENDWHILE	
ENDIF
```

Total Operations:
3(check for error) + 3*m(while loop) + 1(when while loop turns false) = 3m + 4

------------------

Example:
---------
Display all even numbers between 1-100

```

SET x = 2

WHILE x <= 100
	DISPLAY x
	ADD 2 to x
ENDWHILE

```

Algorithm Development:

1. Analyze:
        Understand the problem you are solving.
2. Solve:
        Develope a step by step algo.
        Use a "language" to express it
3. Evaluate:
        Play a human computer to see how the algo works.
        Mistake? Go back to 1 and/or 2.


ALGO RUNTIME: Understand the running time of an algo.


Example:

Inputs: HoursW, wage
Output: Salary

Errors: negative hours, wages less than 0.

```
READ HoursW                             -- 1 operation
READ wages                              -- 1 operation
if(HoursW < 0) or (wages <= 0):         -- 2 operations
        DISPLAY error                   -- 1 operation
else:                                   -- no operations
        HoursW * wages = salary         -- 1 operation
        Sys.out.print(salary)           -- 1 operations
ENDIF                                   -- 0 operations

mod--- % (12 %2 = 0)
READ n2
READ n3
IF n3 == n1 OR n1 == n2 OR n3 ==  n2:
	DISPLAY ERROR
IF n3 > n2 OR n2 > n1:
	DISPLAY FALSE
ENDIF

DISPLAY TRUE

```

-----------------------

PROBLEM: Suppose that we are writing the program for a gas station
pump. The pump has 3 gas types:
	Reg : $2.89
	Premium : $3.70
	SUPER : $4.50
	
The pump accepts cash or credit. If customer pays with card, it is extra 3%.

```py

gas_type = input("Gas Type (Reg, Premium, Super): ")
while gas_type.lower() != "reg" and gas_type.lower() != "premium" and gas_type.lower() != "super":
	print(f"Your gas type was entered inaccurately.\n You entered {gas_type}. \n Please try again.")
	gas_type = input("Gas Type (Reg, Premium, Super): ")
gallons = input("How much gas u want? ")
try:
  gallons = int(gallons)
except ValueError:
  print("Boi get the fuck outta here.")
  exit()
    
while gallons <= 0:
  print(f"U want me to steal yo gas? Gimme {-gallons} gallons bitch.")
  gallons = input("How much gas u want? ")
  gallons = int(gallons)
credit = input("Credit card? Y/N: ")
while credit.lower() != "y" and credit.lower() != "n":
  print(f"You entered {credit}. This is not a choice.")
  credit = input("Credit card? Y/N: ")



def price_calc(gas_type, gallons, is_credit:bool):
	if gas_type.lower() == "reg":
		price = 2.89
	elif gas_type.lower() == "premium":
		price = 3.7
	elif gas_type.lower() == "super":
		price = 4.5
	
	if not is_credit:
		net_price = price * gallons
		print(f"You owe me ${net_price}.")
	else:
		net_price = price * gallons * 1.03
		print(f"You owe me ${net_price}.")
		
if credit.lower() == "y":
	price_calc(gas_type, gallons, is_credit=True)

if credit.lower() == "n":
	price_calc(gas_type, gallons, is_credit=False)

```

-------------

PROBLEM: Write a program to find and display all #s divisible by 3 btwn 1 and n.

```

READ n

SET divisor as 3

SET count as 0
SET check as 1

WHILE check < n
	SET num as check%3
	if num == 0:
		INCREMENT count
	ENDIF
	INCREMENT check
ENDWHILE

PRINT count

```

-------------------


Week 10
===

Primitive VS Abstract Data Types:
----
Primitive Data Types:

- There are 8 types of primitive data types.
- int, boolean, double, char, byte, long, short...

Abstract Data Types:

- Can store as much data as necessary.
- String, Picture, Color...

Implementing a Abstract Data Type (OR MAKING A CLASS):
----

To Create a data type:
- You need instance variables. (Cat example: fur color, eye color for cat)
- The constructor, which instantiates the class. (This usually does not have a return type. (The init method) It's usually named the same thing as the class.
- Ok lmao this is just how to create classes. D: I thought it was important.


Week 11
====

Efficiency of Algorithms

- Find a function of the problem size that behaves like the algorithm's actual time requirement.



How to Determine the runtime:

1) Determine the basic operations in a algorithm.
2) Determine the running time of an algorithm by counting its basic operations.
3) Express the running time of an algorithm as a function of the input size.
4) Derive the <i>Complexity Class</i> of an algorithm. 

So basically does it run in CONSTANT TIME, LINEAR TIME, OR EXPONENTIAL TIME.

Operation Counting:

```java

int sum = 0			// One operation

for(int i = 0; i < n; i++) {    // first statement runs once, second statement  
				//and third statement runs n times leading to 2n+2 fromm that.
	sum += i;		// This is another n, now we have 3n+2
}

// In total, we would end up with 3n+3 operations.
