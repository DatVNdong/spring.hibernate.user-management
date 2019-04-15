function validateSubmit() {
    let finalResult = true;
    let isNotCheckGroup1 = $('div.checkbox.checkbox-content.required-1 :checkbox:checked').length < 1;
    let isNotCheckGroup2 = $('div.checkbox.checkbox-content.required-2 :checkbox:checked').length < 1;
    if (isNotCheckGroup1 || isNotCheckGroup2) {
        alert("Please choose " + (isNotCheckGroup1 ? "Service" : "Type") + ".");
        finalResult = false;
    }
    return finalResult;
}

function setDefaultValue() {
    $('input[name=username]').val('user1');
    $('input[name=password]').val('abcd1234');
}