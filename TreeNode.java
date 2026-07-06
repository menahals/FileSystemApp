/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

/**
 *
 * @author menahalchaudhry
 */
import java.util.List;
public interface TreeNode_Sec99_G4 {
    // ---- Identity ----
    String getName();
    void setName(String newName);

    // ---- Type info ----
    boolean isFolder(); // FolderNode: true, FileNode: false

    // ---- Parent / Child relationships ----
    TreeNode_Sec99_G4 getParent();
    void setParent(TreeNode_Sec99_G4 parent);

    /**
     * Returns direct children. For files (leaves), this should be an empty list.
     * For folders, this should be a modifiable or unmodifiable view per your design.
     */
    List<TreeNode_Sec99_G4> getChildren();

    /**
     * Adds a direct child to this node.
     * REQUIREMENTS (students implement/enforce):
     * - Only folders can accept children.
     * - Names must be unique among siblings (case-insensitive).
     * - Child's parent must be set to this node.
     */
    void addChild(TreeNode_Sec99_G4 child);

    /**
     * Removes a direct child by name.
     * Return true if a child was removed, false otherwise.
     */
    boolean removeChild(String name);

    // ---- Navigation & Info ----
    /**
     * Depth from root (root has depth 0).
     * Implementations may compute directly or delegate to a shared base.
     */
    int depth();

    /**
     * Full absolute path from root (e.g., root/Documents/Notes.txt).
     * Students must implement the logic.
     */
    String getPath();
}
