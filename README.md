# Groovy sum() method unexpected behavior with nested lists

This example demonstrates an unexpected behavior of Groovy's sum() method when applied to a list of lists. The sum() method is designed to work on lists of numbers and throws an exception when applied to a list containing other lists. This is because the sum() method directly adds the elements in the list. When it encounters another list within it, it is unable to perform the arithmetic sum operation.

The solution involves flattening the nested list first before using the sum() method or using a custom function.