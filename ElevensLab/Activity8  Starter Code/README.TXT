Activity 8 Questions:
1. They all play using the same deck of cards and a similar play patterns, the differences being each card's point value,
   what cards can be removed at what time, and the number of cards in play at once.
   -In thirteens, a 10-card board is used, and pairs of cards that add up to 13 can be removed (Jacks and Queens count as 11 
   and 12 points, respectively), and Kings are removed on their own. 
   -In tens, a 10-card board is used, and pairs adding up
   to 10 can be removed. However, groups of Kings, Queens, Jacks, and tens can be removed, but only if the cover all the 
   suits, like King of hearts, diamonds, spades, and clubs at once. 
   -In elevens, a 9-card board is used, pairs of cards adding to 11 can be removed, and a group of 3 cards containing a Jack,
   a Queen, and a King, can be removed as well.
2. The variables are initialized withing the Board class using the ElevensBoard constructor. Within said constructor, since
   ElevensBoard is a subclass of Board, it uses Board's constructor to ctually initialize the variables, but passes in its own
   values using the super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES) line.
3. The two abstract methods the Board class provides are isLegal() and anotherPlayIsPossible(). Both of these could properly
   handle some of the differences between Elevens, Thirteens, and Tens, in that one could have the possible
   ThirteensBoard or TensBoard classes specify what moves are and aren't legal.