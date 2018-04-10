addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.17")


resolvers += Resolver.bintrayRepo("beyondthelines", "maven")

libraryDependencies ++= Seq(
  "com.thesamet.scalapb"   %% "compilerplugin"          % "0.7.1",
  "io.grpc"                %  "grpc-netty"              % "1.11.0",
  "beyondthelines"         %% "grpcakkastreamgenerator" % "0.1.0"
)