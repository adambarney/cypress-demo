$(document).ready(function () {
    addDeleteButtonListener();
});

function addDeleteButtonListener() {
    $('button').on('click', function () {
        let buttonId = $(this).attr('id');
        let divId = '#div' + buttonId.substring(buttonId.indexOf('_'), buttonId.length);
        let divToBeDeleted = $(divId);
        let idToBeDeleted = $(this).data("address-id");
        $.ajax({
            type: "POST",
            contentType: "text/plain",
            url: "/address/delete",
            data: idToBeDeleted,
            cache: false,
            timeout: 600000,
            success: [
                function (data) {
                    divToBeDeleted.remove();
                }
            ],
            error: function (data) {
                alert(data);
            }
        })
    })
}


