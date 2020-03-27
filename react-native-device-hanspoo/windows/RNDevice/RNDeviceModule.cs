using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Device.RNDevice
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNDeviceModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNDeviceModule"/>.
        /// </summary>
        internal RNDeviceModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNDevice";
            }
        }
    }
}
