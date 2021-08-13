# java-hash-table

This is my own implementation of a hash table where the array will continue to resize until there are no collisions. I have started the array size at 3 but realistically you would have that much larger because resizing is an expensive exercise.

I decided to handle collisions this way to make accessing the values faster but this comes at the expense of potentially using more memory. The polynomial rolling hash function has been adapted from elsewhere.
