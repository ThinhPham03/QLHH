package presentation;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


import java.awt.*;


public class StudentManagementApp extends JFrame {

    private DefaultTableModel tableModel;
    private JTable table;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton dateButton;
    private JButton sumButton;
    private JButton viewButton;
  

    public StudentManagementApp() {
       
        setTitle("QUẢN LÝ HÀNG HÓA");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        tableModel = new DefaultTableModel();
    

         
        tableModel.addColumn("Mã mặt hàng");
        tableModel.addColumn("Tên mặt hàng");
        tableModel.addColumn("Số lượng tồn");
        tableModel.addColumn("Đơn giá");
        tableModel.addColumn("Ngày SX");
        tableModel.addColumn("Ngày hết hạn");
        tableModel.addColumn("Nhà cung cấp");
        tableModel.addColumn("Thời gian bảo hành");
        tableModel.addColumn("Công suất");
        tableModel.addColumn("Ngày nhâp kho");
        tableModel.addColumn("Nhà XS");
        tableModel.addColumn("Thời gian bảo hành");
        tableModel.addColumn("Công suất");

        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

 
        JPanel inputPanel = new JPanel(new GridLayout(2, 5));
     
        addButton = new JButton("Thêm");
        editButton = new JButton("Sửa");
        deleteButton = new JButton("Xóa");
        dateButton = new JButton("Hàng cận date");
        sumButton = new JButton("Tổng số lượng mặt hàng");
        viewButton = new JButton("Hiển thị mặt hàng ");

        
        inputPanel.add(addButton);
        inputPanel.add(editButton);
        inputPanel.add(deleteButton);
        inputPanel.add(dateButton);
        inputPanel.add(sumButton);
        inputPanel.add(viewButton);

        add(inputPanel, BorderLayout.SOUTH);
    }}

   