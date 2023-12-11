package de.mk.vitesandbox

import org.scalajs.dom

object Main {

  def main(args: Array[String]): Unit = {
    dom.document.querySelector("#app").innerHTML = s"""
    <div>
      <h1>Hello Scala.js!</h1>
    </div>
  """
  }
}
