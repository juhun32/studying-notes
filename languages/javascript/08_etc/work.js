onmessage = function (event) {
    console.log(event);
    let num = event.data;
    let sum = 0;

    for (let i = 1; i <= num; i++) {
        sum += i;
    }
    postMessage(sum);
}