 function getElementValueByXPath(xpath) {
    // 使用 document.evaluate 获取元素
    const result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);

    // 获取节点
    const node = result.singleNodeValue;

    if (node) {
        // 如果节点存在，返回其值
        return node;
    } else {
        console.log("Element not found.");
        return null; // 或者返回其他指示未找到的值
    }
}

function gogogo() {
  const rs = getElementValueByXPath('/html/body/div[3]/div[2]/main/main/div[2]/div/div/div[1]/div[2]/div/div/p')
    if (rs !== null) {
        const ll = rs.textContent;
        console.log(rs)
        if (ll === "CONNECT TO NEXUS") {
           const buttond = getElementValueByXPath("/html/body/div[3]/div[2]/main/main/div[2]/div/div/div[1]/div[1]/div/div/div/div/div[2]")
           buttond.click()
        } else {
          console.log("没找到  2")
        }
    } else {
      console.log("没找到 1")
    }
}


setTimeout(() => {
  gogogo()
}, 1000* 10)



setInterval(() => {
  gogogo()
}, 1000* 10)
