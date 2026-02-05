#import "@preview/pintorita:0.1.4"

#set page(height: auto, width: auto, fill: black, margin: 2em)
#set text(fill: white)

#show raw.where(lang: "pintora"): it => pintorita.render(it.text)

= Instructions

To compile run ```shell javac *.java``` in the main directory. Then to play run ```shell java GuessingGame```.

== Class Diagram
#image("classdiagram.svg"),

== Alternative
#image("classdiagram_alt.svg"),
