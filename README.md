#                                                                                                                                                                       #
#                                                      -- Table A | ArrayList vs LinkedList --                                                                          #
#                                                                                                                                                                       #
#                Item                 +                              ArrayList                          +                            LinkedList                         #
# ------------------------------------+-----------------------------------------------------------------+-------------------------------------------------------------- #
# Add New Element                     +  Appends the specified element to the end of this list (add)    +   Appends the specified element to the end of this list.      #
# ------------------------------------+-----------------------------------------------------------------+-------------------------------------------------------------- #
# Remove an elemen from the middle    +  Removes the element at the specified position in this list.    +  Removes the first occurrence of the specified element from   #
#                                     +  Shifts any subsequent elements to the left (subtracts one from +  this list, if it is present. If this list does not contain   #
#                                     +  their indices). (remove(i))                                    +  the element, it is unchanged. More formally, removes the     #
#                                     +                                                                 +  element with the lowest index i such that (o==null ?         #
#                                     +                                                                 +  get(i)==null : o.equals(get(i))) (if such an element         #
#                                     +                                                                 +  exists). Returns true if this list contained the specified   #
#                                     +                                                                 +  element (or equivalently, if this list changed as a result   #
#                                     +                                                                 +  of the call).                                                #
#                                     +                                                                 +                                                               #
#                                     +                                                                 +                                                               #
# ------------------------------------+-----------------------------------------------------------------+-------------------------------------------------------------- #
# Insert in the middle a new Element  +  Inserts the specified element at the specified position in     +  Inserts the specified element at the specified position in   #
#                                     +  this list. Shifts the element currently at that position       +  this list. Shifts the element currently at that position     #
#                                     +  (if any) and any subsequent elements to the right (adds one to +  (if any) and any subsequent elements to the right (adds one  #
#                                     +  their indices). (add (i))                                      +  to their indices).                                           #
# ------------------------------------+-----------------------------------------------------------------+-------------------------------------------------------------- #
# Iterate over the whole collection   +  Returns an iterator over the elements in this list in proper   +  Returns a list-iterator of the elements in this list (in     #
#                                     +  sequence. (iterator())                                         +  proper sequence), starting at the specified position in the  #
#                                     +                                                                 +  list. Obeys the general contract of List.listIterator(int).  #
#                                     +                                                                 +                                                               #
#                                     +                                                                 +  The list-iterator is fail-fast: if the list is structurally  #
#                                     +                                                                 +  modified at any time after the Iterator is created, in any   #
#                                     +                                                                 +  way except through the list-iterator's own remove or add     #
#                                     +                                                                 +  methods, the list-iterator will throw a                      #
#                                     +                                                                 +  ConcurrentModificationException. Thus, in the face of        #
#                                     +                                                                 +  concurrent modification, the iterator fails quickly and      #
#                                     +                                                                 +  cleanly, rather than risking arbitrary, non-deterministic    #
#                                     +                                                                 +  behavior at an undetermined time in the future.              #
# ------------------------------------+-----------------------------------------------------------------+-------------------------------------------------------------- #
# Sorting the collection              +  Sorts this list according to the order induced by the          +  Sorts this list according to the order induced by the        #
#                                     +  specified Comparator.                                          +  specified Comparator.                                        #
#                                     +                                                                 +                                                               #
#                                     +  All elements in this list must be mutually comparable using    +  All elements in this list must be mutually comparable using  #
#                                     +  the specified comparator (that is, c.compare(e1, e2) must not  +  the specified comparator (that is, c.compare(e1, e2) must    #
#                                     +  throw a ClassCastException for any elements e1 and e2 in the   +  not throw a ClassCastException for any elements e1 and e2    #
#                                     +  list).                                                         +  in the list).                                                #
#                                     +                                                                 +                                                               #
#                                     +  If the specified comparator is null then all elements in this  +  If the specified comparator is null then all elements in     #
#                                     +  list must implement the Comparable interface and the elements' +  this list must implement the Comparable interface and the    #
#                                     +  natural ordering should be used.                               +  elements' natural ordering should be used.                   #
#                                     +                                                                 +                                                               #
#                                     +  This list must be modifiable, but need not be resizable.       +  This list must be modifiable, but need not be resizable.     #
# ------------------------------------+-----------------------------------------------------------------+-------------------------------------------------------------- #
#                                                                                                                                                                       #
#                                                                                                                                                                       #
#                                                          -- Table B | HashMap vs TreeMap --                                                                           #
#                                                                                                                                                                       #
#                Item                 +                              HashMap                            +                            TreeMap                            #
# ------------------------------------+-----------------------------------------------------------------+-------------------------------------------------------------- #
#  Put a new Element                  +  Associates the specified value with the specified key in this  +  Associates the specified value with the specified key in     #
#                                     +  map. If the map previously contained a mapping for the key,    +  this map. If the map previously contained a mapping for      #
#                                     +  the old value is replaced.                                     +  the key, the old value is replaced.                          #
# ------------------------------------+-----------------------------------------------------------------+-------------------------------------------------------------- #
#  Find a new Element by Key          +  Returns the value to which the specified key is mapped,        +  Returns the value to which the specified key is mapped,      #
#                                     +  or null if this map contains no mapping for the key.           +  or null if this map contains no mapping for the key.         #
#                                     +                                                                 +                                                               #
#                                     +  More formally, if this map contains a mapping from a key k to  +  More formally, if this map contains a mapping from a key k   #
#                                     +  a value v such that (key==null ? k==null : key.equals(k)),     +  to a value v such that key compares equal to k according to  #
#                                     +  then this method returns v; otherwise it returns null.         +  the map's ordering, then this method returns v; otherwise    #
#                                     +  (There can be at most one such mapping.)                       +  it returns null. (There can be at most one such mapping.)    #
#                                     +                                                                 +                                                               #
#                                     +  A return value of null does not necessarily indicate that the  +  A return value of null does not necessarily indicate that    #
#                                     +  map contains no mapping for the key; it's also possible that   +  the map contains no mapping for the key; it's also possible  #
#                                     +  the map explicitly maps the key to null. The containsKey       +  that the map explicitly maps the key to null. The containsKey#
#                                     +  operation may be used to distinguish these two cases.          +  operation may be used to distinguish these two cases.        #
# ------------------------------------+-----------------------------------------------------------------+-------------------------------------------------------------- #
#  Remove a new Element by key        +  Removes the mapping for the specified key from this map        +  Removes the mapping for this key from this TreeMap if        #
#                                     +  if present.                                                    +  present.                                                     #
# ------------------------------------+-----------------------------------------------------------------+-------------------------------------------------------------- #
#  Iterate over the whole entries     +  Performs the given action for each entry in this map until all +  Performs the given action for each entry in this map until   #
#                                     +  entries have been processed or the action throws an exception. +  all entries have been processed or the action throws an      #
#                                     +  Unless otherwise specified by the implementing class, actions  +  exception. Unless otherwise specified by the implementing    #
#                                     +  are performed in the order of entry set iteration (if an       +  class, actions are performed in the order of entry set       #
#                                     +  iteration order is specified.) Exceptions thrown by the action +  iteration (if an iteration order is specified.)              #
#                                     +  are relayed to the caller. (forEach)                           +  Exceptions thrown by the action are relayed to the caller.   #
# ------------------------------------+-----------------------------------------------------------------+-------------------------------------------------------------- #
#                                                                                                                                                                       #
