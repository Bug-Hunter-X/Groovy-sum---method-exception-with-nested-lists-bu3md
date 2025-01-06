def list = [1, 2, 3, 4, 5]

println list.sum() //This will work fine

def list2 = [[1,2],[3,4],[5]]
println list2.flatten().sum() //This will work fine now. flatten() flattens the list

//Alternative solution using inject method for more complex scenarios
def list3 = [[1,2],[3,4],[5,6, [7,8]]]
println list3.flatten().sum() //This will work fine now. flatten() flattens the list

def customSum(list) {
    list.inject(0) { acc, element ->
        if (element instanceof List) {
            acc + customSum(element) 
        } else {
            acc + element
        }
    }
}

println "Custom sum: "+customSum(list3) //Handles nested lists of arbitrary depth