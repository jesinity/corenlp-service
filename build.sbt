import sbt.Resolver

resolvers += Resolver.bintrayRepo("beyondthelines", "maven")

version := "1.0"
scalaVersion := "2.11.11"
organization := "it.jesinity.corenlp"
resolvers ++= Seq(
  Resolver.mavenLocal
)
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "beyondthelines" %% "grpcakkastreamruntime" % "0.1.0"
)
name := "stanford-nlp-service"

PB.targets in Compile := Seq(
  // compile your proto files into scala source files
  scalapb.gen() -> (sourceManaged in Compile).value,
  // generate the GRPC Akka stream source code
  grpc.akkastreams.generators.GrpcAkkaStreamGenerator() -> (sourceManaged in Compile).value
)

