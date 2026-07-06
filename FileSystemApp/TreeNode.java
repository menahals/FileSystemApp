/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileSystemApp;

import java.util.List;
public interface TreeNode_Sec99_G4 {
    String getName();
    void setName(String newName);
    boolean isFolder(); 
    TreeNode_Sec99_G4 getParent();
    void setParent(TreeNode_Sec99_G4 parent);
    List<TreeNode_Sec99_G4> getChildren();
    void addChild(TreeNode_Sec99_G4 child);
    boolean removeChild(String name);
    int depth();
    String getPath();
}
