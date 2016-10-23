package com.sksamuel.elastic4s.aggregations

import org.elasticsearch.search.aggregations.AggregationBuilders

case class GeoHashGridAggregationDefinition(name: String)
  extends AggregationDefinition[GeoHashGridAggregationDefinition, GeoHashGridBuilder] {

  val aggregationBuilder = AggregationBuilders.geohashGrid(name)

  def precision(precision: Int): this.type = {
    builder.precision(precision)
    this
  }

  def field(field: String): this.type = {
    builder.field(field)
    this
  }

  def shardSize(shardSize: Int): this.type = {
    builder.shardSize(shardSize)
    this
  }
  def size(size: Int): this.type = {
    builder.size(size)
    this
  }
}
