package com.api.foodapp.models.responses

import com.api.foodapp.models.data_models.UserModel
import java.io.Serializable

class UserListResponse:Serializable {
    var page: Int? = null
    var per_page: Int? = null
    var total: Int? = null
    var total_pages: Int? = null
    var data: List<UserModel?>? = null
}