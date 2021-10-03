//Q1
function reverse(arr){
    var temp=0;
    var start=0;
    var end=arr.length-1;
    while(start<end){
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    return arr
}
console.log(reverse([1,2,3,4,5,6]))

//Q2

function rotate(arr,x){
    var res=Array(arr.length).fill(0);
    var i=0;
    var len=arr.length-1
    // console.log(res)
    while(i <arr.length){
        if(i+x>len){
            var rotate=(i+x)%len;
            res[rotate-1]=arr[i]
        }else{
            res[i+x]=arr[i]
        }

        i++
    }

    var j=0;
    for (let i = 0; i < res.length; i++) {
        if (res[i] < 0) {
            if (i !=j ){
                let temp = res[i];
                res[i] = res[j];
                res[j] = temp;
            }
            j++;
        }
    }
    return res
}
//Q3
function filterRange (arr, min, max){
    var retain = 0;
    var index = 0;
    for (i = 0; i < arr.length; i++){
        if (arr[i] < min || arr[i] > max){
            retain++;
        } else {
            arr[index] = arr[i];
            index++;
        }
    }

    arr.length = arr.length - retain;
    return arr;
}
console.log(filterRange([2,2,3,5,7],1,4))

//Q4

function arrConcat(arr1,arr2){
    for (var i of arr2){
        arr1.push(i);
    }
    return arr1;
}
console.log(arrConcat([1,2,3],[4,5]))