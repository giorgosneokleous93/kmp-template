//
//  ContentView.swift
//  templateiOS
//
//  Created by Giorgos Neokleous on 15/07/2020.
//  Copyright © 2020 Giorgos Neokleous. All rights reserved.
//

import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        Text(Proxy().proxyHello())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
