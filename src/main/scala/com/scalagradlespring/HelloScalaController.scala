package com.scalagradlespring

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RestController
@RequestMapping
class HelloScalaController () {

  @GetMapping(Array("/hello-scala"))
  def hello() = {
    "Hello Scala !!!"
  }

}