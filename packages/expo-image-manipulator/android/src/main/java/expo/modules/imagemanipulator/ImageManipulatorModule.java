package expo.modules.imagemanipulator;

import android.content.Context;

import expo.core.ExportedModule;
import expo.core.ModuleRegistry;
import expo.core.Promise;
import expo.core.interfaces.ExpoMethod;
import expo.core.interfaces.ModuleRegistryConsumer;

public class ImageManipulatorModule extends ExportedModule implements ModuleRegistryConsumer {
  private static final String TAG = "ExpoImageManipulatorModule";

  private ModuleRegistry mModuleRegistry;

  public ImageManipulatorModule(Context context) {
    super(context);
  }

  @Override
  public String getName() {
    return TAG;
  }

  @Override
  public void setModuleRegistry(ModuleRegistry moduleRegistry) {
    mModuleRegistry = moduleRegistry;
  }

  @ExpoMethod
  public void someGreatMethodAsync(Map<String, Object> options, final Promise promise) {
  }
}
