Activity 9 Questions:
1. Because regardless of what game is being played, it will always use a Card[] within the Board class, and all the size()
   method does is return the length of that array, which would always return the correct value.
2. Because as with the size() method, those will never change based on the game that is being played. The rules of what will
   be removed or replaced may change, but the function will always remain the same.
3. isLegal() and anotherPlayIsPossible() would both work polymorphically, as they would be defined by whatever class determines
   the game functions, but this also means that all the other methods would need to be implemented in the game board's class as
   well, making it highly inefficient as many work the same way.
   