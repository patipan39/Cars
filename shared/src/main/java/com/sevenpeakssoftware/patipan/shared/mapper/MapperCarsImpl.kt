package com.sevenpeakssoftware.patipan.shared.mapper

import com.sevenpeakssoftware.patipan.model.room.RoomCarsItem
import kotlin.collections.ArrayList

class MapperCarsImpl : MapperCars<ArrayList<RoomCarsItem>, ArrayList<BaseCarsListItem>> {

  override fun mapperCarsItem(items: ArrayList<RoomCarsItem>): ArrayList<BaseCarsListItem> {

    val listCarsItem: ArrayList<BaseCarsListItem> = arrayListOf()

    if (items.isEmpty() &&items.count() <=0 ) {
      listCarsItem.add(EmptyItem(-1))
      return listCarsItem
    }

    items.forEachIndexed { _, item ->
      val carsItems = CarsListItem(
        itemId = item.itemId,
        title = item.title,
        image = item.image,
        publishDate = item.publishDate,
        ingress = item.ingress
      )
      listCarsItem.add(carsItems)
    }

    return listCarsItem
  }
}