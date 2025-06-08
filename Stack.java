import java.util.EmptyStackException;

public class Stack
{
    private final int maxSize;
    private final String [] stack;
    private int top = -1;

    public Stack(int maxSize)
    {
        this.maxSize = maxSize;
        this.stack = new String [maxSize];
    }

    public void push(String data)
    {
        if (isFull())
        {
            throw new StackOverflowError();
        }
        else
        {
            top ++;
            stack[top] = data;
        }
    }

    public String pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        else
        {
            top --;
            return stack[top + 1];
        }
    }

    public boolean isFull()
    {
        return top + 1 == maxSize;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }
}
