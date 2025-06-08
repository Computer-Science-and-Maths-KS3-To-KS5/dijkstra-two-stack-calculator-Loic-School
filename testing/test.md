# Testing

## Functionality

| Test # | Input Expression           | Expected Output | Actual Output | Target(s) Covered                                          |
|--------|----------------------------|-----------------|---------------|------------------------------------------------------------|
| 1      | (4 * 7)                    | 28.0            | 28.0          | (1) valid expression, (2) evaluation of simple expression  |
| 2      | ((5 / 4) * 8)              | 10.0            | 10.0          | (1) valid expression, (2) evaluation of complex expression |
| 3      | (9 + x)                    | error message   | error message | (3) invalid expression                                     |
| 4      | (4 / (6 + 14))             | 0.2             | 0.2           | (4) 2 digit integer                                        |
| 5      | (1  +  ((2+3) * ( 4  *5))) | 101.0           | 101.0         | (5) all spaces ignored                                     |

## User Interface

### Valid Input Example, Test #5

![Screenshot of the command line after Test #5 is complete](../screenshots/valid-input-example.png)

### Invalid Input Example, Test #3

![Screenshot of the command line after Test #3 is complete](../screenshots/invalid-input-example.png)
