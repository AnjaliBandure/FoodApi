package com.api.foodapp.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.api.foodapp.R
import com.api.foodapp.interfaces.ApiInterface
import com.api.foodapp.models.responses.UnknownListResponse
import com.api.foodapp.models.responses.UserListResponse
import com.api.foodapp.models.rest_api.RestAdapterContainer
import kotlinx.android.synthetic.main.activity_unknown_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UnknownListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unknown_list)

        var service = RestAdapterContainer.getInstance().create(ApiInterface::class.java)
        var call: Call<UnknownListResponse> = service.getUnkownList()
        call.enqueue(object : Callback<UnknownListResponse> {
            override fun onFailure(call: Call<UnknownListResponse>, t: Throwable) {
                Toast.makeText(this@UnknownListActivity, "$(t.LocaLizedMessage)", Toast.LENGTH_LONG)
                    .show()
            }

            override fun onResponse(
                call: Call<UnknownListResponse>,
                response: Response<UnknownListResponse>
            ) {
                if (response.body() == null) {
                    Toast.makeText(
                        this@UnknownListActivity,
                        "$(response.message()",
                        Toast.LENGTH_LONG
                    ).show()
                    return

                }

                var UnknownListResponse = response.body()
                var page = UnknownListResponse()!!.page
                var per_Page = UnknownListResponse().per_page
                var total = UnknownListResponse().total
                var total_Pages = UnknownListResponse().total_pages
                var unknownList = UnknownListResponse().data
            }
        })


    }
}