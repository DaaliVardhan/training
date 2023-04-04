
chrome.storage.local.get({state:false}).then((result)=>{
    const elements = document.querySelectorAll("body *");
    const colors = ["red", "green", "blue", "yellow", "orange", "purple", "pink"];

    let count = result.count;
    if(!count){
        elements.forEach((element) => {
            element.style.outline = `2px solid ${colors[Math.floor(Math.random() * colors.length)]}`;
          });
        chrome.storage.local.set({counte:true})
    } 
    else{
        chrome.storage.local.set({count:false})
        elements.forEach((element) => {
            element.style.outline = "";
        });
    }
});

