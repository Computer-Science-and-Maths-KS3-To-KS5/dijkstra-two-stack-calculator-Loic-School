# Design

## Main Algorithm Outline

1. The expression is processed from left to right, character to character
2. If an open bracket is encountered, then it is ignored
3. If an operand is encountered, then it is pushed onto the operand stack
4. If an operator is encountered, then it is pushed onto the operator stack
5. If a closed bracket is encountered, then an operation is carried out and the result is pushed onto the operand stack
6. Steps 2 - 5 are repeatedly carried out until there are no more characters to process
7. The output is what remains on the operand stack

## Datastructures

### Stack

During the processing of the expression, I will need to store operands and operators separately and will need to retrieve them in the opposite order they were inserted. I will use a stack to do this because it is a last-in-first-out (LIFO) datastructure. When an operand or operator is encountered, it will be pushed onto the stack. When a closed bracket is encountered, the necessary operands and operators will be popped from the stacks. When an operation is complete, its result will be pushed onto the operand stack.

## Psuedocode

### Main Algorithm

```
OUTPUT heading sentence
INPUT expression from user
FOR each character in the expression
  IF current character is
    '(' OR ' ' THEN ignore
    operand THEN push onto operand stack
    operator THEN push onto operator stack
    ')' THEN carry out an operation AND push the result onto the operand stack
  ELSE OUTPUT error message
  ENDIF
ENDFOR
OUTPUT operand from the operand stack
```

### Stack

```
SUB push (data)
  IF stack is full THEN give an error
  ELSE increment top pointer AND insert data at top pointer
  ENDIF
ENDSUB
SUB pop ()
  IF stack is empty THEN give an error
  ELSE decrement top pointer AND return data at top pointer + 1
ENDSUB
SUB isFull()
  IF top pointer + 1 = max size THEN RETURN true
  ELSE RETURN false
  ENDIF
ENDSUB
SUB isEmpty()
  IF top pointer = -1 THEN RETURN true
  ELSE RETURN false
  ENDIF
ENDSUB
```

## User Interface

### Justification

I will use a command line interface (CLI) for simplicity because the scope of this project is limited to the functionality of the calculator rather than the aesthetics of the interface. By choosing a CLI, no functionality is lost, so a graphical user interface (GUI) could be implemented on top of my project without many reworks to the main algorithm.

### Valid Input Example

```
Welcome to the Dijkstra Calculator

Enter an expression --> [user input]

The expression evaluates to [computer output]
```

### Invalid Input Example

```
Welcome to the Dijkstra Calculator

Enter an expression --> [user input]

The expression you have entered is invalid
```
