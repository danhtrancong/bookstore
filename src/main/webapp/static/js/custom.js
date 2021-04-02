$("#btn-save").click(function(event){
    event.preventDefault();
    var formdata = $("#form-product").serializeArray();
    json = {};
    arraydetail = [];

    $.each(formdata, function(i, field){
        json[field.name]   = field.value;
    });


    $.ajax({
        url:"/bookstore/product/save-product",
        type:"POST",
        data:{
            dataJson: JSON.stringify(json)
        },
        success: function(value){

        }
    })

})