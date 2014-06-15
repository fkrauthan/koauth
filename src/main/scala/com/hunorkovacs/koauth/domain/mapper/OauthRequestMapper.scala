package com.hunorkovacs.koauth.domain.mapper

import com.hunorkovacs.koauth.domain.OauthRequest
import scala.concurrent.{ExecutionContext, Future}

trait OauthRequestMapper[RequestType] {

  def map(source: RequestType)(implicit ec: ExecutionContext): Future[OauthRequest]
}
