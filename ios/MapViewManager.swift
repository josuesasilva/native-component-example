//
//  MapViewManager.swift
//  NativeComponentExample
//
//  Created by Josué Santos on 13/10/19.
//  Copyright © 2019 Facebook. All rights reserved.
//

import MapKit

@objc(MapViewManager)
class MapViewManager: RCTViewManager {
 
  override func view() -> UIView! {
    return MKMapView(frame: .zero)
  }
  
  override static func requiresMainQueueSetup() -> Bool {
    return false
  }
  
}
