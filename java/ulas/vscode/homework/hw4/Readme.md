# Homework 4: ArrayList Exercise

We will build a hypothetical factory for this homework.

Create three `ArrayList` fields in your program:

- `ArrayList<String> entryUnit`
- `ArrayList<String> processingUnit`
- `ArrayList<Character> transportUnit`

Have a loop that waits for input and starts a new day *(iteration)* every time the user inputs 1, and exits the loop and ends the program when the user inputs 2 —you will need a `Scanner` object for this and you may need to get input on the *boolean section* of your loop operator— or the `entryUnit` or `transportUnit` reaches a certain size. You are free to choose whatever sensible upper limit you want.

Every 5 days, 6 new Strings are added to the entry unit. Make sure that the Strings are chosen randomly from a **pre-generated array of strings.**

Every day, 1 String at a random **valid** position on the `entryUnit` is removed and moved to the `processingUnit`. The `processingUnit` reverses and stores the Strings. *For instance, if it is passed the String `"tebigep"`, the processed version of this String would be `"pegibet"`.*

Every 7 days, 7 Strings are removed from the `processingUnit` and are moved to the `transportUnit`. However, this unit is top secret, so we don’t know its contents. We only know the first characters of the Strings it is given. *For instance, if it is passed the String `"pegibet"`, `transportUnit` would hold only `'p'` for that String.*

At the end of every day, print every `ArrayList` in the following format:

> \$NAME_OF_THE_ARRAYLIST$: \$ARRAYLIST_AS_STRING$

Before ending the program, print out how many days the factory has worked and how many objects each unit has at that point in the following format:

> The factory is shut down on day \$DAY$.
> 
> 
> \$NAME_OF_THE_UNIT$ contains \$SIZE$ objects.