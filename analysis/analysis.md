# Analysis

## Algorithm Overview

Dijkstra's two stack algorithm evaluates an infix expression using 2 stacks. The expression must be fully paranthesised as to eliminate all ambiguity in the order of operations.

## Targets

- A valid expression must only contain the following characters:
  - ( open bracket
  - ) closed bracket
  - \+ addition
  - \- subtraction
  - \* multiplication
  - / division
  - 0-9 integers
  - ' ' spaces
- Any fully paranthesised valid expression can be evaluated by the algorithm
- If the algorithm encounters an invalid expression an error message should be given
- Integers with more than 1 digit must be accepted
- Spaces will be ignored
