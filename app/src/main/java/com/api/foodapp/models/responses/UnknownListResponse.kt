package com.api.foodapp.models.responses

import com.api.foodapp.models.data_models.UnknownModel
import java.io.Serializable

class UnknownListResponse:Serializable {
    var page:Int?=null
    var per_page:Int?=null
    var total :Int?=null
    var totalpages:Int?=null
    var data:List<UnknownModel?>?=null
}