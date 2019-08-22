//
//  SecondViewController.swift
//  iOSWKWebViewApp
//
//  Created by Luca Tagliabue on 19/08/2019.
//  Copyright © 2019 Luca Tagliabue. All rights reserved.
//

import UIKit
import SharedBusinessLogic

class SecondViewController: WKWebViewController {
    override var pageUrl: String {
        return Page.boredButton.url
    }
}

