# Analysis

## Algorithm Overview

Dijkstra's two stack algorithm evaluates an infix expression using 2 stacks. The expression must be fully paranthesised as to eliminate all ambiguity in the order of operations.

## Targets

1. A valid expression must only contain the following characters:
   - ( open bracket
   - ) closed bracket
   - \+ addition
   - \- subtraction
   - \* multiplication
   - / division
   - 0-9 integers
   - ' ' spaces
2. Any fully paranthesised valid expression can be evaluated by the algorithm
3. An invalid expression must result in an error message
4. Integers with more than 1 digit must be accepted
5. Spaces will be ignored
