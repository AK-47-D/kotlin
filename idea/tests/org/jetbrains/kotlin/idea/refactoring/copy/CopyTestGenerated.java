/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.refactoring.copy;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/refactoring/copy")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CopyTestGenerated extends AbstractCopyTest {
    public void testAllFilesPresentInCopy() throws Exception {
        KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/copy"), Pattern.compile("^(.+)\\.test$"), TargetBackend.ANY);
    }

    @TestMetadata("copyClassCaretInside/copyClassCaretInside.test")
    public void testCopyClassCaretInside_CopyClassCaretInside() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyClassCaretInside/copyClassCaretInside.test");
        doTest(fileName);
    }

    @TestMetadata("copyClassToExistingFile/copyClassToExistingFile.test")
    public void testCopyClassToExistingFile_CopyClassToExistingFile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyClassToExistingFile/copyClassToExistingFile.test");
        doTest(fileName);
    }

    @TestMetadata("copyClassToNewFile/copyClassToNewFile.test")
    public void testCopyClassToNewFile_CopyClassToNewFile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyClassToNewFile/copyClassToNewFile.test");
        doTest(fileName);
    }

    @TestMetadata("copyClassToSamePackageWithRename/copyClassToSamePackageWithRename.test")
    public void testCopyClassToSamePackageWithRename_CopyClassToSamePackageWithRename() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyClassToSamePackageWithRename/copyClassToSamePackageWithRename.test");
        doTest(fileName);
    }

    @TestMetadata("copyClassWithCompanionRefs/copyClassWithCompanionRefs.test")
    public void testCopyClassWithCompanionRefs_CopyClassWithCompanionRefs() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyClassWithCompanionRefs/copyClassWithCompanionRefs.test");
        doTest(fileName);
    }

    @TestMetadata("copyClassWithRename/copyClassWithRename.test")
    public void testCopyClassWithRename_CopyClassWithRename() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyClassWithRename/copyClassWithRename.test");
        doTest(fileName);
    }

    @TestMetadata("copyFIleFromDefaultPackage/copyFIleFromDefaultPackage.test")
    public void testCopyFIleFromDefaultPackage_CopyFIleFromDefaultPackage() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyFIleFromDefaultPackage/copyFIleFromDefaultPackage.test");
        doTest(fileName);
    }

    @TestMetadata("copyFIleRetainContent/copyFIleRetainContent.test")
    public void testCopyFIleRetainContent_CopyFIleRetainContent() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyFIleRetainContent/copyFIleRetainContent.test");
        doTest(fileName);
    }

    @TestMetadata("copyFIleToDefaultPackage/copyFIleToDefaultPackage.test")
    public void testCopyFIleToDefaultPackage_CopyFIleToDefaultPackage() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyFIleToDefaultPackage/copyFIleToDefaultPackage.test");
        doTest(fileName);
    }

    @TestMetadata("copyFIleWithPackageAndDirUnmatched/copyFIleWithPackageAndDirUnmatched.test")
    public void testCopyFIleWithPackageAndDirUnmatched_CopyFIleWithPackageAndDirUnmatched() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyFIleWithPackageAndDirUnmatched/copyFIleWithPackageAndDirUnmatched.test");
        doTest(fileName);
    }

    @TestMetadata("copyFunCallQualificationWithParentheses/copyFunCallQualificationWithParentheses.test")
    public void testCopyFunCallQualificationWithParentheses_CopyFunCallQualificationWithParentheses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyFunCallQualificationWithParentheses/copyFunCallQualificationWithParentheses.test");
        doTest(fileName);
    }

    @TestMetadata("copyLocalClass/copyLocalClass.test")
    public void testCopyLocalClass_CopyLocalClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyLocalClass/copyLocalClass.test");
        doTest(fileName);
    }

    @TestMetadata("copyLocalFunction/copyLocalFunction.test")
    public void testCopyLocalFunction_CopyLocalFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyLocalFunction/copyLocalFunction.test");
        doTest(fileName);
    }

    @TestMetadata("copyLocalVariable/copyLocalVariable.test")
    public void testCopyLocalVariable_CopyLocalVariable() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyLocalVariable/copyLocalVariable.test");
        doTest(fileName);
    }

    @TestMetadata("copyMemberFunction/copyMemberFunction.test")
    public void testCopyMemberFunction_CopyMemberFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyMemberFunction/copyMemberFunction.test");
        doTest(fileName);
    }

    @TestMetadata("copyMemberProperty/copyMemberProperty.test")
    public void testCopyMemberProperty_CopyMemberProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyMemberProperty/copyMemberProperty.test");
        doTest(fileName);
    }

    @TestMetadata("copyMultiClassFile/copyMultiClassFile.test")
    public void testCopyMultiClassFile_CopyMultiClassFile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyMultiClassFile/copyMultiClassFile.test");
        doTest(fileName);
    }

    @TestMetadata("copyMultipleClassesToExistingFile/copyMultipleClassesToExistingFile.test")
    public void testCopyMultipleClassesToExistingFile_CopyMultipleClassesToExistingFile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyMultipleClassesToExistingFile/copyMultipleClassesToExistingFile.test");
        doTest(fileName);
    }

    @TestMetadata("copyMultipleClassesToNewFile/copyMultipleClassesToNewFile.test")
    public void testCopyMultipleClassesToNewFile_CopyMultipleClassesToNewFile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyMultipleClassesToNewFile/copyMultipleClassesToNewFile.test");
        doTest(fileName);
    }

    @TestMetadata("copyMultipleDeclarations/copyMultipleDeclarations.test")
    public void testCopyMultipleDeclarations_CopyMultipleDeclarations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyMultipleDeclarations/copyMultipleDeclarations.test");
        doTest(fileName);
    }

    @TestMetadata("copyNestedClass/copyNestedClass.test")
    public void testCopyNestedClass_CopyNestedClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyNestedClass/copyNestedClass.test");
        doTest(fileName);
    }

    @TestMetadata("copyObject/copyObject.test")
    public void testCopyObject_CopyObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyObject/copyObject.test");
        doTest(fileName);
    }

    @TestMetadata("copySingleClassFile/copySingleClassFile.test")
    public void testCopySingleClassFile_CopySingleClassFile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copySingleClassFile/copySingleClassFile.test");
        doTest(fileName);
    }

    @TestMetadata("copyTopLevelFunction/copyTopLevelFunction.test")
    public void testCopyTopLevelFunction_CopyTopLevelFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyTopLevelFunction/copyTopLevelFunction.test");
        doTest(fileName);
    }

    @TestMetadata("copyTopLevelFunctionWithRename/copyTopLevelFunctionWithRename.test")
    public void testCopyTopLevelFunctionWithRename_CopyTopLevelFunctionWithRename() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyTopLevelFunctionWithRename/copyTopLevelFunctionWithRename.test");
        doTest(fileName);
    }

    @TestMetadata("copyTopLevelProperty/copyTopLevelProperty.test")
    public void testCopyTopLevelProperty_CopyTopLevelProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyTopLevelProperty/copyTopLevelProperty.test");
        doTest(fileName);
    }

    @TestMetadata("copyTopLevelPropertyWithRename/copyTopLevelPropertyWithRename.test")
    public void testCopyTopLevelPropertyWithRename_CopyTopLevelPropertyWithRename() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyTopLevelPropertyWithRename/copyTopLevelPropertyWithRename.test");
        doTest(fileName);
    }

    @TestMetadata("copyWithImportInsertion/copyWithImportInsertion.test")
    public void testCopyWithImportInsertion_CopyWithImportInsertion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/copyWithImportInsertion/copyWithImportInsertion.test");
        doTest(fileName);
    }

    @TestMetadata("kt18149/kt18149.test")
    public void testKt18149_Kt18149() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/kt18149/kt18149.test");
        doTest(fileName);
    }

    @TestMetadata("refToImportJavaStaticField/refToImportedJavaStaticField.test")
    public void testRefToImportJavaStaticField_RefToImportedJavaStaticField() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/refToImportJavaStaticField/refToImportedJavaStaticField.test");
        doTest(fileName);
    }

    @TestMetadata("refToImportJavaStaticMethod/refToImportedJavaStaticMethod.test")
    public void testRefToImportJavaStaticMethod_RefToImportedJavaStaticMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/refactoring/copy/refToImportJavaStaticMethod/refToImportedJavaStaticMethod.test");
        doTest(fileName);
    }
}
