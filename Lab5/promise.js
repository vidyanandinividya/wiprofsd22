//creating promise
const lotteryPromise=new Promise(function(resolve,reject){
    console.log('Lotery draw is happening');
    setTimeout(()=>{
        if(Math.random()>=0.5)
        {
            resolve('YOU WIN');
        }
        else
        {
            reject('YOU LOST YOUR MONEY');
        }
    },3000)
    
});
//consuming promise
lotteryPromise.then(res=>console.log(res)).catch(err=>console.error(err));
