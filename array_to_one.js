//Q1
function pushfront(arr, value) {
    for (var i = arr.length - 1; i > -1; i--) {
        arr[i + 1] = arr[i]
    }
    arr[0] = value
    console.log(arr)
    return arr
}

pushfront([1, 2, 3], 4)
//Q2
function remove(arr) {
    var temp = arr[0];
    for (var i = 0; i < arr.length; i++) {
        arr[i] = arr[i + 1];
    }
    arr.pop()
    console.log(arr)
    return temp
}
console.log(remove([2, 5, 4, 6]))

//Q3

function insertAt(arr, x, val) {
    if (arr.length - 1 > val) {
        for (var i = 0; i < arr.length; i++) {
            if (i == x) {
                arr[i] = val
            }
        }
        return arr
    }
    return "this index is outbound"
}
console.log(insertAt([2, 5, 4, 6], 5, 3))

//Q4
function removeAt(arr,x){
    var temp=arr[x];
   
    console.log(arr[x])
   while(x < arr.length){
            
            arr[x]=arr[x+1];
            x++;
      
    }
    arr.pop();
    return arr
    }
    console.log(removeAt([2,5,4,6,7],1))