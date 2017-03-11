package com.example

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import db._

class PingController extends Controller {

  import ctx._

  get("/ping") { request: Request =>
    val puppy_name_query = quote {
      query[Puppy].filter(_.id == 1).map(_.name)
    }

    ctx.run(puppy_name_query)

  }
}
