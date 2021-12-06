// // Push Front
// // Given an array and an additional value, insert this value at the beginning of the array. Do this without using any built-in array methods.
// // input (array[item,item],value) 
// // output [value,item,item]
// //[] return [value]

// const { forEach } = require("core-js/core/array");
// const element = require("domhandler/lib/element");

// //Q1
// function pushfront(arr,value){
//     for(var i=arr.length-1;i>-1;i--){
//         arr[i+1]=arr[i]
//     }
//     arr[0]=value
//     console.log(arr)
//     return arr
// }

// pushfront([1,2,3],4)

// //last question to do 1
// // function count(param1,param2,param3,param4){
// //     while(param2 <= param3){
// //         if(param2 % param1 == 0 && param2!=param4){
// //             console.log(param2);
// //         }
// //         param2+=1;
// //     }
// //     return 0;
// // }

// // count(3,5,17,9)\

// // //Q2
// function remove(arr){
// var temp=arr[0];
// for(var i=0;i<arr.length;i++){
//     arr[i]=arr[i+1];
// }
// arr.pop()
// console.log(arr)
// return temp
// }
// console.log(remove([2,5,4,6]))

// //Q3
// function insertAt(arr,x,val){
//     if(arr.length-1>val){
//         for(var i=0;i<arr.length;i++){
//             if (i==x){
//                 arr[i]=val
//             }
//         }
//         return arr
//     }
//     return "this index is outbound"
// }
// console.log(insertAt([2,5,4,6],5,3))

// //Q4
// function removeAt(arr,x){
//     var temp=arr[x];
   
//     console.log(arr[x])
//    while(x < arr.length){
            
//             arr[x]=arr[x+1];
//             x++;
      
//     }
//     arr.pop();
//     return arr
//     }
//     console.log(removeAt([2,5,4,6,7],1))

// function reverse(arr){
//     var temp=0;
//     var start=0;
//     var end=arr.length-1;
//     while(start<end){
//         temp=arr[start];
//         arr[start]=arr[end];
//         arr[end]=temp;
//         start++;
//         end--;
//     }
//     return arr
// }
// console.log(reverse([1,2,3,4,5,6]))
// function reverse(arr){
//     for(var i=0;i<arr.length/2;i++){
//         var temp=arr[i];
//         arr[i]=arr[arr.length-1-i];
//         arr[arr.length-1-i]=temp;
//     }
//     return arr;
// }
// console.log(reverse([1,5,6,8,1,2]))
// // Q3

// function rotate(arr,x){
//     var res=Array(arr.length).fill(0);
//     var i=0;
//     var len=arr.length-1
//     // console.log(res)
//     while(i <arr.length){
//         if(i+x>len){
//             var rotate=(i+x)%len;
//             res[rotate-1]=arr[i]
//         }else{
//             res[i+x]=arr[i]
//         }

//         i++
//     }

//     var j=0;
//     for (let i = 0; i < res.length; i++) {
//         if (res[i] < 0) {
//             if (i !=j ){
//                 let temp = res[i];
//                 res[i] = res[j];
//                 res[j] = temp;
//             }
//             j++;
//         }
//     }
//     return res
// }
// function filterRange (arr, min, max){
//     var retain = 0;
//     var index = 0;
//     for (i = 0; i < arr.length; i++){
//         if (arr[i] < min || arr[i] > max){
//             retain++;
//         } else {
//             arr[index] = arr[i];
//             index++;
//         }
//     }

//     arr.length = arr.length - retain;
//     return arr;
// }
// console.log(filterRange([2,2,3,5,7],1,4))

// function arrConcat(arr1,arr2){
//     for (var i of arr2){
//         arr1.push(i);
//     }
//     return arr1;
// }
// console.log(arrConcat([1,2,3],[4,5]))

function solution(str){
    let newstr=str.toLowerCase();
    let sol=newstr.split("");
    for(let i=0;i<sol.length;i++){
      if(i%2==0){
        sol[i]=sol[i].toUpperCase();
        
      }
    }
    let res=""
    sol.forEach(myFunction);
    function myFunction(index){
      res += index;
    }
    return res
  }
  console.log(solution("HELLO1235"))