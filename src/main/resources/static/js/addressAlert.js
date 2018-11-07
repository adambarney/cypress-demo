$(document).ready(function () {
    $('button').on('click', function () {
        let buttonId = $(this).attr('id');
        let divId = '#div' + buttonId.substring(buttonId.indexOf('_'), buttonId.length);
        let divToBeDeleted = $(divId);
        let idToBeDeleted = $(this).data("address-id");
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/address/delete",
            data: JSON.stringify(idToBeDeleted),
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
});

